import pymongo
client = pymongo.MongoClient()
db = client.test
user_input = "admin"
result = db.users.find_one({"username": user_input})
