fun main()
{
    val analyze = "Анализ"
    val pay = "Оплата"
    val cancel = "Отмена"

    printMainMenu()
    val selectedItemMenu = readItemMenu()
    when(selectedItemMenu){
        analyze -> analyzeOrder()
        pay -> payOrder()
        cancel -> cancelOrder()
    }
}
fun printMainMenu()
{
    println("1. Посчитать стоимость продуктовой корзины\n" +
            "2. Оплатить покупку\n" +
            "3. Отменить покупку\n")
}
fun readItemMenu(): String {
    return readln()
}
fun analyzeOrder() {
    println("Идет анализ продуктовой корзины\n")
    val productsName = arrayOf("Макарошки", "Гречка", "Сало", "Пшено", "Рис", "Кусок металла")
    val productPrice = arrayOf(14, 69, 240, 31, 46, 10000)
    var isError = false
    var totalPrice = 0

    do{
        val name = readln()
        if(name != "Продуктовая корзина пустая")
        {
            var isFind = false
            for(index in productsName.indices)
            {
                if(productsName[index] == name) {
                    isFind = true
                    break
                }
            }
            if(!isFind)
            {
                isError = true
                println("Товар \"$name\" не найден в базе данных")
                break
            }
            for(index in productsName.indices)
            {
                if(productsName[index] == name)
                {
                    totalPrice+=productPrice[index]
                    break
                }
            }
        }
        else
            break
    }while(true)
    if(!isError)
        println("Стоимость всех товаров в продуктовой корзине: $totalPrice кредитов")
}
fun payOrder()
{
    println("Происходит процесс оплаты\n")
    println("Оплата прошла успешно")
}
fun cancelOrder()
{
    println("Идет отмена покупки\n")
    println("Покупка отменена")
}