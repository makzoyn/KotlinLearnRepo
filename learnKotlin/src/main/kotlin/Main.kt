import kotlin.system.exitProcess

fun main() {
    val game = 1
    val guide = 2
    val exit = 3
    var isFirstStart = true

    while(true){
        printMainMenu(isFirstStart)
        when(readItemMenu()){
            game ->
                runGame()
            guide ->
                showGuide()
            exit -> exitProcess(0)
        }
        isFirstStart = false
    }
}
fun printMainMenu(isFirstStart: Boolean) {
    if(!isFirstStart)
        println()
    println("1. Запустить игру")
    println("2. Гид по игре")
    println("3. Выйти из игры")
}

fun readItemMenu(): Int {
    println("Выберите пункт:")
    println()
    val userInput = readln().toInt()
    when(userInput)
    {
        1 -> println("Идет запуск игры\n")
        2 -> println("Открывается гид по игре\n")
        3 -> println("Идет закрытие игры\n")
    }
    return userInput
}

fun runGame() {
    val start = 0
    val end = 100
    val randomNumber = (start..end).random()
    do {
        println("Введите число:")
        val turn = readln().toInt()
        if(turn > randomNumber)
            println("Загаданное число меньше")
        else if(turn < randomNumber)
            println("Загаданное число больше")
        else{
            print("Вы угадали число!")
            break
        }
    } while (true)
}

fun showGuide() {
    print("Вопрос: Какая цель игры?\nОтвет: Целью игры является отгадывание числа, придуманного ИИ \"Алиса\", за минимальное число попыток.\n\n")
    print("Вопрос: Сколько дается попыток?\nОтвет: Количество попыток вычисляет Алиса по собственной формуле, и она отказывается раскрывать ее.\n\n")
    print("Вопрос: Есть ограничение по времени?\nОтвет: Алиса очень терпеливая, она будет ждать вашего ответа до тех пор, пока ее Создатель не забудет оплатить счет за аренду сервера.")
}