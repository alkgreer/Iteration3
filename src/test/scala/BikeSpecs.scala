// src/test/scala/ComputersSpecs.scala
package test.scala
import specification._

object BikeSpecs extends Specification {
  import Iteration.abstractClass._

  "MountainBike takes speed, Color and features and" should {
    val myFeatures = List("Hybrid", "Cup Holder", "Flat Bar")
    val myMountainBike = new MountainBike(9, "Blue", myFeatures)

    "Properly construct the class" in {
      // Check if computer was setup correctly
      (myMountainBike.speed === 9) and
      (myMountainBike.color === "Blue") and
      (myMountainBike.features === myFeatures)
    }
    "Return proper string for getSpecs" in {
      // Test .getSpecs() inherited from Computer
      myMountainBike.getSpecs() === "Speed: 9 \nColor: Blue"
    }
    "Return the number of features" in {
      // Test .getNumDevices()
      myMountainBike.getNumFeatures() === 3
    }
  }

  "SpeedBike takes speed, Color and a material and" should {
    val mySpeedBike = new SpeedBike(10, "Red", "Aluminum")

    "Properly construct the class" in {
      // Check if computer was setup correctly
      (mySpeedBike.speed === 10) and
      (mySpeedBike.color === "Red") and
      (mySpeedBike.material === "Aluminum")
    }
    "Return proper string for getSpecs" in {
      // Test .getSpecs() inherited from Computer
      mySpeedBike.getSpecs() === "Speed: 10 \nColor: Red"
    }
    "Return proper string fro getCarrier" in {
      // Test .getCarrier
      mySpeedBike.getMaterial() === "StreetBike Material: Aluminum"
    }
  }
}
