
object SpaceAge {

  def calculateAge(age: Double, multiplier: Double): Double =
    age / (60 * 60 * 24 * 365.25) / multiplier

  def onEarth(age: Double): Double = calculateAge(age, 1.0)

  def onVenus(age: Double): Double = calculateAge(age, 0.61519726)

  def onMercury(age: Double): Double = calculateAge(age, 0.2408467)

  def onMars(age: Double): Double = calculateAge(age, 1.8808158)

  def onJupiter(age: Double): Double = calculateAge(age, 11.862615)

  def onSaturn(age: Double): Double = calculateAge(age, 29.447498)

  def onUranus(age: Double): Double = calculateAge(age, 84.016846)

  def onNeptune(age: Double): Double = calculateAge(age, 164.79132)
}
