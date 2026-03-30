package ejercito

import soldado.Soldado

import scala.collection.mutable.ArrayBuffer



class Ejercito(val nombre: String) {
  private val soldados: ArrayBuffer[Soldado] = new ArrayBuffer[Soldado]
  def abandona(soldado: Soldado): Unit = {
    val indice: Int = soldados.indexof(soldado)
    if (indice >= 0) {soldados.remove(indice)
      soldado.abandonar()}
  def unir(soldado: Soldado): Unit = {
    if (soldado.ejercito != null) {soldado.abandonar()}
    soldados += soldado
    soldado.unirse(this)
  }
  }

}
