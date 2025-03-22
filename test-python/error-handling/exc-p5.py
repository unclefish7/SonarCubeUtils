from flask import Flask
app = Flask(__name__)

@app.route("/")
def index():
    try:
        1 / 0
    except:
        return "error"
