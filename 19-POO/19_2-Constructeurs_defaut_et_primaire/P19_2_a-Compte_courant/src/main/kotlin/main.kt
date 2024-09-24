class BankAccount(deposited: Long, withdrawn: Long){
    val balance = deposited - withdrawn
}

fun main() {
    val account = BankAccount(100, 20)
    println(account.balance)
}
