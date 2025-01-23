class RepositorioCompras {
    private val compras = mutableListOf<Compra>()

    fun agregar(cliente: Cliente, dia: Int, total: Double){
        compras.add(Compra(cliente, dia, total))
    }

    fun agregar(compra: Compra){
        compras.add(compra)
    }

    fun agregar(nombre: String, calle: String, mumero: Int, dia: Int, total: Double) {

        val domicilio = Domicilios(calle, numero)
        val cliente = Cliente(nombre, domicilio)
        agregar(cliente, dia, total)
    }

    fun domilicio(): List<Domicilios> {
        val domicilio = mutableSetOf<Domicilios>()

        for (compra in compras){
            domicilio.add(compra.cliente.domicilio)
        }
        return domicilios.toList()
    }

    fun domiciliosV3(): List<Domicilio> {
        val domicilios = mutableSetOf<Domilicios>()

        compras.forEach()
    }
}

fun main(){
    val repositorioCompra = RepositorioCompras()

    val domiciliosNuria = Domicilios("Calle las Flore")
}