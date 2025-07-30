package general;

import com.redbluetechnologies.casparcg.Communicator;
import com.redbluetechnologies.casparcg.Result;
import com.redbluetechnologies.casparcg.command.thumbnail.Generate;
import com.redbluetechnologies.casparcg.command.thumbnail.GenerateAll;
import com.redbluetechnologies.casparcg.command.thumbnail.List;
import com.redbluetechnologies.casparcg.command.thumbnail.Retrieve;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ThumbnailCommandsTest {
    private static Communicator communicator;

    @BeforeAll
    static void setupBeforeAll() {
        communicator = new Communicator("127.0.0.1", 5250);
    }

    @Test
    void generate() {
        Result result = communicator.sendCommand(new Generate("AMB"));
        assertThat(result.getResponse()).isEqualTo("202 THUMBNAIL GENERATE OK");
    }

    @Test
    void generate_all() {
        Result result = communicator.sendCommand(new GenerateAll());
        assertThat(result.getResponse()).isEqualTo("202 THUMBNAIL GENERATE_ALL OK");
    }

    @Test
    void list() {
        Result result = communicator.sendCommand(new List());
        assertThat(result.getResponse()).contains("200 THUMBNAIL LIST OK");
    }

    @Test
    void retrieve() {
        Result result = communicator.sendCommand(new Retrieve("AMB"));
        assertThat(result.getResponse()).contains("201 THUMBNAIL RETRIEVE OK\r\n");
    }
}
