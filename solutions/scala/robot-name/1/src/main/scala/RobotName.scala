import scala.util.Random

class Robot {
  private var _name: Option[String] = None

  def name: String = _name match {
    case Some(n) => n
    case None =>
      val newName = RobotNameGenerator.generateUniqueName()
      _name = Some(newName)
      newName
  }

  def reset(): Unit = {
    // Optional: RobotNameGenerator.releaseName(_name) 
    // if you want to make names available again
    _name = None
  }
}

object RobotNameGenerator {
  private val usedNames = scala.collection.mutable.Set[String]()
  private val rng = new Random()

  def generateUniqueName(): String = {
    val newName = createName(2, 3)
    
    // Ensure uniqueness via recursion
    if (usedNames.contains(newName)) {
      generateUniqueName() 
    } else {
      usedNames += newName
      newName
    }
  }

  private def createName(letterCount: Int, digitCount: Int): String = {
    val letters = List.fill(letterCount)(rng.nextPrintableChar)
      .filter(c => c >= 'A' && c <= 'Z') // Simple filter or use (65 + rng.nextInt(26)).toChar
    
    val alphas = (1 to letterCount).map(_ => (rng.nextInt(26) + 'A').toChar).mkString
    val digits = (1 to digitCount).map(_ => rng.nextInt(10)).mkString
    
    alphas + digits
  }
}
