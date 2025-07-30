package general;

import com.redbluetechnologies.casparcg.Communicator;
import com.redbluetechnologies.casparcg.Result;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;
import com.redbluetechnologies.casparcg.command.query.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class QueryCommandsTest {
    private static Communicator communicator;

    @BeforeAll
    static void setupBeforeAll() {
        communicator = new Communicator("127.0.0.1", 5250);
    }

    @AfterAll
    static void tearDownAfterAll() {
        try {
            communicator.sendCommand(new Bye());
            communicator.close();
        } catch (IOException ignored) {
            // niet boeiend
        }
    }

    @Test
    void cinf() {
        Result result = communicator.sendCommand(new CINF("AMB"));
        assertThat(result.getResponse()).contains("201 CINF OK");
    }

    @Test
    void GLGC() {
        Result result = communicator.sendCommand(new GLGC( ));
        assertThat(result.getResponse()).isEqualTo("202 GL GC OK");
    }

    @Test
    void gl_info() {
        Result result = communicator.sendCommand(new GLInfo());
        assertThat(result.getResponse()).contains("201 GL INFO OK");
    }

    @Test
    void info() {
        Result result = communicator.sendCommand(new Info(new VideoChannelLayer(1)));
        assertThat(result.getResponse()).contains("201 INFO OK");
    }

    @Test
    void info_config() {
        Result result = communicator.sendCommand(new InfoConfig());
        assertThat(result.getResponse()).contains("201 INFO CONFIG OK");
    }

    @Test
    void info_delay() {
        Result result = communicator.sendCommand(new InfoDelay(new VideoChannelLayer(1)));
        assertThat(result.getResponse()).contains("201 INFO OK");
    }

    @Test
    void info_paths() {
        Result result = communicator.sendCommand(new InfoPaths());
        assertThat(result.getResponse()).contains("201 INFO PATHS OK");
    }

    @Test
    void info_queues() {
        Result result = communicator.sendCommand(new InfoQueues());
        assertThat(result.getResponse()).contains("200 INFO OK");
    }

    @Test
    void info_server() {
        Result result = communicator.sendCommand(new InfoServer());
        assertThat(result.getResponse()).contains("200 INFO OK");
    }

    @Test
    void info_system() {
        Result result = communicator.sendCommand(new InfoSystem());
        assertThat(result.getResponse()).contains("200 INFO OK");
    }

    @Test
    void info_template() {
        Result result = communicator.sendCommand(new InfoTemplate("titel-m2/titel-m2"));
        assertThat(result.getResponse()).contains("200 INFO OK");
    }

    @Test
    void info_threads() {
        Result result = communicator.sendCommand(new InfoThreads());
        assertThat(result.getResponse()).contains("200 INFO OK");
    }

    @Test
    void tls() {
        Result result = communicator.sendCommand(new TLS());
        assertThat(result.getResponse()).contains("200 TLS OK");
    }

    @Test
    void version() {
        Result result = communicator.sendCommand(new Version());
        assertThat(result.getResponse()).contains("201 VERSION OK");
    }
}
