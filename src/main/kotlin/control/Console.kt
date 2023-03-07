package control

class Console private constructor(){
    companion object {
        fun readInt(msg: String): Int {
            var retorno: Int? = null
            do {
                print(msg)
                val info = readln()

                if (info != null && info != "") { // verifica se veio nulo ou vazio
                    retorno = info.toIntOrNull()

                    if (retorno == null || retorno <= 0) { // caso informe a idade <= 0
                        println("Valor inválido")
                    }

                } else {
                    println("Valor inválido") // caso não informe a idade
                }
            } while (retorno == null || retorno <= 0)

            return retorno
        }

        fun readString(msg: String): String {
            var retorno: String? = null
            do {
                print(msg)
                val info = readln()

                if (info != null && info != "") {
                    retorno = info.lowercase()
                } else {
                    println("Valor inválido")
                }
            } while (retorno == null)
            return retorno
        }
    }
}