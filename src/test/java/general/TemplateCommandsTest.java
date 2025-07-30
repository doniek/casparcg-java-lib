package general;

import com.redbluetechnologies.casparcg.Communicator;
import com.redbluetechnologies.casparcg.Result;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;
import com.redbluetechnologies.casparcg.command.template.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TemplateCommandsTest {
    private static Communicator communicator;

    @BeforeAll
    static void setupBeforeAll() {
        communicator = new Communicator("127.0.0.1", 5250);
    }

    @Test
    void add() {
        Result result = communicator.sendCommand(new Add(new VideoChannelLayer(1, 20, 10), "titel-m2/titel-m2", true, ""));
        assertThat(result.getResponse()).isEqualTo("202 CG OK");
    }

    @Test
    void clear() {
        Result result = communicator.sendCommand(new Clear(new VideoChannelLayer(1, 20, 10)));
        assertThat(result.getResponse()).isEqualTo("202 CG OK");
    }

    @Disabled("Wordt later gefixt")
    @Test
    void info() {
        communicator.sendCommand(new Add(new VideoChannelLayer(1, 20, 10), "titel-m2/titel-m2", true, ""));
        communicator.sendCommand(new Play(new VideoChannelLayer(1, 20, 10)));
        Result result = communicator.sendCommand(new Info(new VideoChannelLayer(1, 20, 10)));
        assertThat(result.getResponse()).isEqualTo("201 CG OK");
    }

    @Test
    void invoke() {
        communicator.sendCommand(new Add(new VideoChannelLayer(1, 20, 10), "titel-m2/titel-m2", true, ""));
        Result result = communicator.sendCommand(new Invoke(new VideoChannelLayer(1, 20, 10), "RUN"));
        assertThat(result.getResponse()).isEqualTo("201 CG OK");
    }

    @Test
    void next() {
        communicator.sendCommand(new Add(new VideoChannelLayer(1, 20, 10), "titel-m2/titel-m2", true, ""));
        Result result = communicator.sendCommand(new Next(new VideoChannelLayer(1, 20, 10)));
        assertThat(result.getResponse()).isEqualTo("202 CG OK");
    }

    @Test
    void play() {
        communicator.sendCommand(new Add(new VideoChannelLayer(1, 20, 10), "titel-m2/titel-m2", true, ""));
        Result result = communicator.sendCommand(new Play(new VideoChannelLayer(1, 20, 10)));
        assertThat(result.getResponse()).isEqualTo("202 CG OK");
    }

    @Test
    void remove() {
        communicator.sendCommand(new Add(new VideoChannelLayer(1, 20, 10), "titel-m2/titel-m2", true, ""));
        Result result = communicator.sendCommand(new Remove(new VideoChannelLayer(1, 20, 10)));
        assertThat(result.getResponse()).isEqualTo("202 CG OK");
    }

    @Test
    void stop() {
        communicator.sendCommand(new Add(new VideoChannelLayer(1, 20, 10), "titel-m2/titel-m2", true, ""));
        Result result = communicator.sendCommand(new Stop(new VideoChannelLayer(1, 20, 10)));
        assertThat(result.getResponse()).isEqualTo("202 CG OK");
    }

    @Test
    void update() {
        communicator.sendCommand(new Add(new VideoChannelLayer(1, 20, 10), "titel-m2/titel-m2", true, ""));
        Result result = communicator.sendCommand(new Update(new VideoChannelLayer(1, 20, 10), ""));
        assertThat(result.getResponse()).isEqualTo("202 CG OK");
    }
}
