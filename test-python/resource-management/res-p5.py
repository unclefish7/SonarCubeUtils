from flask import Flask
app = Flask(__name__)

@app.route("/upload")
def upload():
    file = open("upload.txt", "w")
    file.write("data")
    return "ok"
