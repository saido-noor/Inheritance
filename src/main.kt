fun main() {
    var cars = Car("Toyota", "Mazda", "Red",4)
    var bus = Bus("Toyota FC Bus", "Sora", "White", 79)
    cars.carry(9)
    cars.identity()
    println(cars.calculateParkingFees(5))
    println(bus.maxTipFare(50.5))
    println(bus.calculateParkingFees(3))







}

open class Vehicles(var make:String, var model:String, var color:String, var capacity:Int){
    open fun carry(people: Int) {
        var x = people - capacity
        if (people<=capacity){
            println(println("Carrying $people passengers "))
        } else( println("Over capacity by $x"))

    }

    fun identity() {
        println("I am a $color Subaru legacy")
    }

    open fun calculateParkingFees(hours: Int):Int{
        var totalFees = hours*20
        return totalFees


    }

}

class Car(make:String, model:String, color:String, capacity:Int):Vehicles(make,model,color,capacity) {


}




class Bus(make:String, model:String, color:String, capacity:Int):Vehicles(make,model,color,capacity){
    fun maxTipFare(fare: Double):Double{
        var maximumAmountFare = fare*capacity
        return maximumAmountFare

    }

    override fun calculateParkingFees(hours: Int): Int {
        var totalFees = hours*capacity
        return totalFees

    }

}