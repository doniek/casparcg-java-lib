package general;

import com.redbluetechnologies.casparcg.Communicator;
import com.redbluetechnologies.casparcg.Result;
import com.redbluetechnologies.casparcg.command.VideoChannelLayer;
import com.redbluetechnologies.casparcg.command.basic.Play;
import com.redbluetechnologies.casparcg.command.mixer.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MixerCommandsTest {
    private static Communicator communicator;
    private static VideoChannelLayer videoChannelLayer;

    @BeforeAll
    static void setupBeforeAll() {
        communicator = new Communicator("127.0.0.1", 5250);
        videoChannelLayer = new VideoChannelLayer(1, 20);
    }

    @Test
    void anchor() {
        Result result = communicator.sendCommand(new Anchor(videoChannelLayer, 0.9F, 0.9F));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void blend() {
        Result result = communicator.sendCommand(new Blend(videoChannelLayer, "OVERLAY"));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void brightness() {
        Result result = communicator.sendCommand(new Brightness(videoChannelLayer, 0.5F));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void chroma() {
        Result result = communicator.sendCommand(new Chroma(videoChannelLayer));
        assertThat(result.getResponse()).contains("201 MIXER OK");
    }

    @Test
    void clear() {
        Result result = communicator.sendCommand(new Clear(videoChannelLayer));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void clip() {
        Result result = communicator.sendCommand(new Clip(videoChannelLayer, 0.5F, 0.5F, 1F, 1F));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void commit() {
        Result result = communicator.sendCommand(new Commit(videoChannelLayer));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void contrast() {
        Result result = communicator.sendCommand(new Contrast(videoChannelLayer, 0.5F));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void crop() {
        Result result = communicator.sendCommand(new Crop(videoChannelLayer, 0.5F, 0.5F, 0.5F, 0.5F));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void fill() {
        Result result = communicator.sendCommand(new Fill(videoChannelLayer, 0.5F, 0.5F, 0.5F, 0.5F));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void grid() {
        communicator.sendCommand(new Play(new VideoChannelLayer(1, 1), "AMB"));
        communicator.sendCommand(new Play(new VideoChannelLayer(1, 2), "AMB"));
        Result result = communicator.sendCommand(new Grid(videoChannelLayer, 2));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void keyer() {
        Result result = communicator.sendCommand(new Keyer(videoChannelLayer, true));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void levels() {
        Result result = communicator.sendCommand(new Levels(videoChannelLayer, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void mastervolume() {
        Result result = communicator.sendCommand(new MasterVolume(videoChannelLayer, 1F));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Disabled("Wordt later gefixt")
    @Test
    void mipmap() {
        Result result = communicator.sendCommand(new MipMap(videoChannelLayer, true));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void opacity() {
        Result result = communicator.sendCommand(new Opacity(videoChannelLayer, 0.6F));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void perspective() {
        Result result = communicator.sendCommand(new Perspective(videoChannelLayer, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void rotation() {
        Result result = communicator.sendCommand(new Rotation(videoChannelLayer, 0.4F));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void saturation() {
        Result result = communicator.sendCommand(new Saturation(videoChannelLayer, 0.4F));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Disabled("Wordt later gefixt")
    @Test
    void straight_alpha_output() {
        Result result = communicator.sendCommand(new StraightAlphaOutput(videoChannelLayer, true));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }

    @Test
    void volume() {
        Result result = communicator.sendCommand(new Volume(videoChannelLayer, 0.4F));
        assertThat(result.getResponse()).isEqualTo("202 MIXER OK");
    }
}
