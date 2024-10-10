class Solution {

    fun solution(video_len: String, pos: String, op_start: String, op_end: String, commands: Array<String>): String {
        val videoLenSecond = timeToSecond(video_len)
        var posSecond = timeToSecond(pos)
        val opStartSecond = timeToSecond(op_start)
        val opEndSecond = timeToSecond(op_end)

        if (posSecond in opStartSecond..opEndSecond) posSecond = opEndSecond

        commands.forEach { command ->
            posSecond = when (command) {
                "prev" -> movePosition(posSecond - 10, 0, videoLenSecond, opStartSecond, opEndSecond)
                "next" -> movePosition(posSecond + 10, 0, videoLenSecond, opStartSecond, opEndSecond)
                else -> posSecond
            }
            if (posSecond in opStartSecond..opEndSecond) posSecond = opEndSecond
        }

        return secondToTime(posSecond)
    }

    fun movePosition(newPos: Int, min: Int, max: Int, opStart: Int, opEnd: Int): Int {
        return when {
            newPos < min -> min
            newPos > max -> max
            newPos in opStart..opEnd -> opEnd
            else -> newPos
        }
    }

    fun timeToSecond(time: String): Int {

        val (minute, second) = time.replace("\"", "")
            .split(":")
            .map { it.toInt() }

        return minute * 60 + second
    }

    fun secondToTime(second: Int): String {

        val minute = second / 60
        val second = second % 60

        return String.format("%02d:%02d", minute, second)
    }
    
}