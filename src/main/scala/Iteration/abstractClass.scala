package Iteration
import Iteration._

object Bicycle {
  abstract class Bicycle(val speed: Int, val color: String) {
    def getSpecs() = s"Speed: $speed " + "\n" + s"Color: $color"
  }

  class MountainBike(speed: Int, color: String, val features: List[String])
      extends Bicycle(speed, color) {
    def getNumFeatures() = features.length
  }

  class StreetBike(speed: Int, color: String, val material: String)
      extends Bicycle(speed, color) {
    def getMaterial() = s"StreetBike Material: $material"
  }

  def main(args: Array[String]) = {
    val myFeatures = List("Hybrid", "Cup Holder", "Flat Bar")
    val myMountainBike = new MountainBike(9, "Blue", myFeatures)
    println(myMountainBike.getSpecs())
    println(s"Number of features: ${myMountainBike.getNumFeatures()}")

    val myStreetBike = new StreetBike(10, "red", "Aluminum")
    println(myStreetBike.getSpecs())
    println(myStreetBike.getMaterial())
  }
}
