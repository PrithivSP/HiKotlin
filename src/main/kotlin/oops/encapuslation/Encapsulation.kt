package oops.encapuslation


class BankAccount(
    val accountNumber: String
) {

    // internal state (hidden)
    private var balance: Double = 0.0

    // read-only access
    fun getBalance(): Double {
        return balance
    }

    // controlled modification
    fun deposit(amount: Double) {
        require(amount > 0) { "Deposit amount must be positive" }
        balance += amount
    }

    // controlled modification
    fun withdraw(amount: Double) {
        require(amount > 0) { "Withdraw amount must be positive" }

        if (amount > balance) {
            throw IllegalStateException("Insufficient balance")
        }

        balance -= amount
    }
}



fun encapsulation() {
    val account = BankAccount("ACC123")

    account.deposit(1000.0)
    println("Balance: ${account.getBalance()}")

    account.withdraw(400.0)
    println("Balance: ${account.getBalance()}")
}
