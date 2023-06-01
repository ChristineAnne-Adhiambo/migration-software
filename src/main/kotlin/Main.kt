fun main() {
    var migration=Migration("dry","low")
    migration.predictWeatherPatterns()
    migration.riverLevels()

}
class Migration(var weatherPatterns:String,var riverLevels:String) {
    fun predictWeatherPatterns() {
        if (weatherPatterns == "wet")
            println("Migration of animals will take place")
        else {
            println("Migration of animals will not take place")
        }

    }

    fun riverLevels() {
        if (riverLevels == "high") {
            println("Migration of animals will not take place")
        } else {
            println("Migration of animals will take place")
        }

    }
}