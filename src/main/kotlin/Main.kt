const val MINUTE = 60
const val HOUR = 60 * 60
const val DAY = 24 * 60 * 60
const val TWO_DAYS = DAY * 2
const val TREE_DAYS = DAY * 3

fun main() {
    val timeInSeconds = readln().toInt()

    println(agoToText(timeInSeconds))
}

fun agoToText(seconds: Int): String {
    return when (seconds) {
        in 0..MINUTE -> "Только что"
        in MINUTE + 1..HOUR -> "${seconds / MINUTE} ${minute(seconds)} назад"
        in HOUR + 1..DAY -> "${seconds / HOUR} ${hour(seconds)} назад"
        in DAY + 1..TWO_DAYS -> "Сегодня"
        in TWO_DAYS + 1..TREE_DAYS -> "Вчера"
        else -> "Давно"
    }
}

fun minute(seconds: Int): String {
    val minutes = seconds / MINUTE
    return when {
        minutes % 10 == 1 -> "минуту"
        minutes % 10 == 2 -> "минуты"
        else -> "минут"
    }
}

fun hour(seconds: Int): String {
    val hours = seconds / HOUR
    return when {
        hours % 10 == 1 -> "час"
        hours % 10 == 2 -> "часа"
        else -> "часов"
    }
}
