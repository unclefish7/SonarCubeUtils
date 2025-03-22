from flask import abort
from flask import Flask
app = Flask(__name__)
@app.route("/fail")
def fail():
    abort(400)
