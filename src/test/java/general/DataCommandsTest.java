package general;

import com.redbluetechnologies.casparcg.Communicator;
import com.redbluetechnologies.casparcg.Result;
import com.redbluetechnologies.casparcg.command.data.List;
import com.redbluetechnologies.casparcg.command.data.Remove;
import com.redbluetechnologies.casparcg.command.data.Retrieve;
import com.redbluetechnologies.casparcg.command.data.Store;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DataCommandsTest {
    private static Communicator communicator;

    @BeforeAll
    static void setupBeforeAll() {
        communicator = new Communicator("127.0.0.1", 5250);
    }

    @Test
    void store() {
        Result result = communicator.sendCommand(new Store("test", "1234"));
        assertThat(result.getResponse()).isEqualTo("202 DATA STORE OK");
    }

    @Test
    void retrieve() {
        communicator.sendCommand(new Store("test", "1234"));
        Result result = communicator.sendCommand(new Retrieve("test"));
        assertThat(result.getResponse()).isEqualTo("201 DATA RETRIEVE OK\r\n1234");
    }

    @Test
    void list() {
        communicator.sendCommand(new Store("test", "1234"));
        Result result = communicator.sendCommand(new List());
        assertThat(result.getResponse()).isEqualTo("200 DATA LIST OK\r\nTEST");
    }

    @Test
    void remove() {
        communicator.sendCommand(new Store("test", "1234"));
        Result result = communicator.sendCommand(new Remove("test"));
        assertThat(result.getResponse()).isEqualTo("202 DATA REMOVE OK");
    }
}
