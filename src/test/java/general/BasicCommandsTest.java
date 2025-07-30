package general;

import com.redbluetechnologies.casparcg.Communicator;
import com.redbluetechnologies.casparcg.Result;
import com.redbluetechnologies.casparcg.command.Raw;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;
import com.redbluetechnologies.casparcg.command.basic.*;
import com.redbluetechnologies.casparcg.command.query.Bye;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BasicCommandsTest {
    private static Communicator communicator;

    @BeforeAll
    static void setupBeforeAll() {
        communicator = new Communicator("127.0.0.1", 5250);
    }

    @AfterAll
    static void tearDownAfterAll() {
        communicator.sendCommand(new Bye());
    }

    @Test
    void version() {
        Result result = communicator.sendCommand(new Raw("VERSION"));
        assertThat(result.getResponse()).contains("201 VERSION OK");
    }

    @Test
    void loadBG() {
        Result result = communicator.sendCommand(new LoadBG(new VideoChannelLayer(1, 20), "AMB"));
        assertThat(result.getResponse()).isEqualTo("202 LOADBG OK");
    }

    @Test
    void load() {
        Result result = communicator.sendCommand(new Load(new VideoChannelLayer(1, 20), "AMB"));
        assertThat(result.getResponse()).isEqualTo("202 LOAD OK");
    }

    @Test
    void play() {
        Result result = communicator.sendCommand(new Play(new VideoChannelLayer(1, 20), "AMB"));
        assertThat(result.getResponse()).isEqualTo("202 PLAY OK");
    }

    @Test
    void pause() {
        Result result = communicator.sendCommand(new Pause(new VideoChannelLayer(1, 20)));
        assertThat(result.getResponse()).isEqualTo("202 PAUSE OK");
    }

    @Test
    void resume() {
        Result result = communicator.sendCommand(new Resume(new VideoChannelLayer(1, 20)));
        assertThat(result.getResponse()).isEqualTo("202 RESUME OK");
    }

    @Test
    void stop() {
        Result result = communicator.sendCommand(new Stop(new VideoChannelLayer(1, 20)));
        assertThat(result.getResponse()).isEqualTo("202 STOP OK");
    }

    @Test
    void clear() {
        Result result = communicator.sendCommand(new Clear(new VideoChannelLayer(1)));
        assertThat(result.getResponse()).isEqualTo("202 CLEAR OK");
    }

    @Disabled("Wordt later gefixed")
    @Test
    void call() {
        communicator.sendCommand(new Play(new VideoChannelLayer(1, 20), "AMB"));
        Result result = communicator.sendCommand(new Call(new VideoChannelLayer(1, 20), "LOOP"));
        assertThat(result.getResponse()).isEqualTo("201 CALL OK");
    }

    @Test
    void swap() {
        communicator.sendCommand(new Play(new VideoChannelLayer(1, 10), "AMB"));
        communicator.sendCommand(new Play(new VideoChannelLayer(1, 20), "CG1080i50"));
        Result result = communicator.sendCommand(new Swap(new VideoChannelLayer(1, 20), new VideoChannelLayer(1, 10)));
        assertThat(result.getResponse()).isEqualTo("202 SWAP OK");
    }

    @Test
    void print() {
        Result result = communicator.sendCommand(new Print(new VideoChannelLayer(1)));
        assertThat(result.getResponse()).isEqualTo("202 PRINT OK");
    }

    @Disabled("Wordt later gefixt")
    @Test
    void log_category() {
        Result result = communicator.sendCommand(new LogCategory("trace", true));
        assertThat(result.getResponse()).isEqualTo("202 LOG OK");
    }

    @Test
    void log_level() {
        Result result = communicator.sendCommand(new LogLevel("trace"));
        assertThat(result.getResponse()).isEqualTo("202 LOG OK");
    }

    @Disabled("Wordt later gefixt")
    @Test
    void set() {
        Result result = communicator.sendCommand(new Set(new VideoChannelLayer(2), "MODE", "PAL"));
        System.out.println(result.getResponse());
        assertThat(result.getResponse()).isEqualTo("202 SET MODE OK");
    }
}
