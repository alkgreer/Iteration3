// src/test/scala/SearchEngineSpecs.scala
package milestoneproject
import org.specs2.mutable.Specification

object SearchEngineSpecs extends Specification {
  import milestoneProject.searchEngine._

  /*******************************************************
  ** Create data to test on
  *******************************************************/
  // Make some searches and fill them with results
  val GameSearch = Search("League of Legends", List(
    Result("Top 5 plays", "The best plays of League of Legends"),
    Result("Top 5 Champions", "The best champions of League of Legends"),
    Result("Builds", "Champion build guides for League of Legends")
  ))

  val VideoSearch = Search("Funny", List(
    Result("Top 5 funniest moments", "The funniest moments"),
    Result("Top 5 funniest things", "The funniest things"),
    Result("Funny Comedians", "Comedians whom are funny")
  ))

  // Create some users
  val Alisha = new User("Alisha", "StrongPassWord", List(GameSearch, VideoSearch, GameSearch))
  val Kate = new User("BestFriend", "SecretPass", List(GameSearch))
  val Marcus = new User("Marcus", "TypicalPass", List(VideoSearch))
  val Kevin = new User("Kev", "Pass")

  // Create a list of all the users
  val emptyUserSearches = List(Kevin)
  val searchEngineUsers = List(Alisha, Kate, Marcus)

  /*******************************************************
  ** Specs2 Tests
  *******************************************************/
  "userFrequentSearch takes a User and looks at their searchHistory field" should {

    "Properly handle User with no search history" in {
      userFrequentSearch(Kevin) === "No Search History"
    }

    "Find the User's most frequent search" in {
      userFrequentSearch(Kate) === "League of Legends"
    }
  }

  "engineFrequentSearch takes a list of Users and looks all their searchHistory fields" should {

    "Properly handle a list that yeilds no search history" in {
      engineFrequentSearch(emptyUserSearches) === "No Searches Found"
    }

    "Find the most frequent search across all Users" in {
      engineFrequentSearch(searchEngineUsers) === "League of Legends"
    }
  }
}
