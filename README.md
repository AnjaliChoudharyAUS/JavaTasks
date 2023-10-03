# JavaTasks
Contains some Java OOP tasks and there codes.
Task 3
*********************************************************************************************
Create feedback application


Customer{
id: int
name: String
changeName(newName)

}


Feedback{
id: int
description: String
customer : Customer

}

Create a feedback store and customer store
1) add feedback in feedback store
2) register customer in customer store
3) fetch all feedbacks by customer id
**********************************************************************************************
Java task 4
**********************************************************************************************
Create a guest management task for hotel

Assume there are 8 rooms in a hotel, 4 rooms in every floor

Create a main class HotelClient to test your application is working

Details below

Guest{

id:long
firstName:String
lastName:String
emailId: String

}

Room{

roomNumber:int
floor:int
checkedIn:Guest
roomType: String // deluxe or normal
pricePerDay: double
}

Hotel{
name: String
rooms: Room[]
findGuestCheckedInRoom(roomId): Guest
guestsCount(): int
earningToday(): double // add prices of rooms where guest is staying
findAllGuests(): Guest[]
}
**********************************************************************************************
