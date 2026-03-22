
class School {
  private type DB = Map[Int, Seq[String]]

  // 1. Define a variable to hold the state at the top
  private var database: DB = Map().withDefaultValue(Seq.empty)

  // 2. Update the variable in add
  def add(name: String, g: Int): Unit = {
    val existingNames = database(g)
    database = database + (g -> (existingNames :+ name))
  }

  // 3. Return the current state of the variable
  def db: DB = database

  def grade(g: Int): Seq[String] = {
    // Since it's a Map[Int, Seq[String]], just look up the key
    database.getOrElse(g, Seq.empty)
  }

  def sorted: DB = {
    // Sort keys (grades) and their internal lists (names)
    scala.collection.immutable.ListMap(
      database.toSeq.sortBy(_._1).map {
        case (grade, names) => (grade, names.sorted)
      }*
    )
  }
}
