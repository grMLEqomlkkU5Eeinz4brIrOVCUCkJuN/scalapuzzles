object Bob {
  def response(statement: String): String = statement match {
    case shoutQ if shoutQ.toUpperCase == shoutQ && shoutQ.toLowerCase != shoutQ && shoutQ.trim.endsWith("?") =>"Calm down, I know what I'm doing!"
    case shout if shout.toUpperCase == shout && shout.toLowerCase != shout => "Whoa, chill out!"
    case question if question.trim.endsWith("?") => "Sure."
    case nothing if nothing.trim.isEmpty => "Fine. Be that way!"
    case _ => "Whatever."
  }
}
