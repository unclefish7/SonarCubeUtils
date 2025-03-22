from flask import Flask
app = Flask(__name__)

@app.route("/upload")
def upload():
    with open("upload.txt", "w") as f:
        f.write("data")
    return "ok"
