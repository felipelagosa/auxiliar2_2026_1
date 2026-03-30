package soldado

import ejercito.Ejercito

class Soldado(var ps: Int, val nombre: String, val atq: Int) {
  private var EstadoVital: Boolean = true
  var ejercito: Ejercito = null
  def atacar(soldado: Soldado): Unit = {
    soldado.ps -= atq
    if (soldado.ps <= 0) then soldado.muere()
    soldado.abandonar()
  }
  private def muere(): Unit = {
    EstadoVital = false
  }
  def unirse(nuevoejercito: Ejercito): Unit = {
    if (ejercito == null) { ejercito=nuevoejercito
    nuevoejercito.unir(this)
    }
    this.abandonar()
    this.unirse(nuevoejercito)
  }
  def abandonar(): Unit = {
   if (ejercito != null) {
     ejercito.abandona(this)
     ejercito = null
   }
  }
}
