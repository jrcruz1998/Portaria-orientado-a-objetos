package business

import entity.Convidado

class ConvidadoBusiness {
    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    /*
    ou fazer assim

    class ConviteBusiness {
        fun tipoValido(tipo: String): Boolean {
            return (tipo == "comum" || tipo == "premium" || tipo == "luxo")
        }
    }
     */

    fun maiorDeIdade(idade: Int) = idade >= 18

    fun convidadoValido(convite: Convidado) = when (convite.tipo) { // QUANDO
        "comum" -> convite.codigo.startsWith("xt")
        // retorna true
        "premium", "luxo" -> convite.codigo.startsWith("xl")
        // retorna true
        else -> false
        // retorna false
    }

}
    /*
    ou fazer assim

    fun codigoValido(convite: Convite): Boolean {
        return when (convite.tipo) { // QUANDO
            "comum" -> {
                return convite.codigo.startsWith("xt")
            } // retorna true
            "premium", "luxo" -> {
                return convite.codigo.startsWith("xl")
            } // retorna true
            else -> {
                return false
            } // retorna false
        }

    } */