package org.firstinspires.ftc.teamcode.next.tuning

import com.qualcomm.ftccommon.SoundPlayer
import com.qualcomm.robotcore.eventloop.opmode.Disabled
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import dev.nextftc.ftc.NextFTCOpMode
import org.firstinspires.ftc.robotcore.external.android.AndroidSoundPool

@Disabled
@TeleOp
class TestSound: NextFTCOpMode() {
    val a by lazy { AndroidSoundPool() }
    override fun onInit() {
        a.initialize(
            SoundPlayer.getInstance()
        )
    }

    override fun onStartButtonPressed() {
        a.volume = 1.0f
        a.play("Relocate April tag.mp3")
    }

    override fun onStop() {
        a.close()
    }
}