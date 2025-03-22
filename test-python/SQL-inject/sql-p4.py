from flask import Flask, request
import sqlite3

app = Flask(__name__)

@app.route("/user")
def get_user():
    username = request.args.get("username")
    query = f"SELECT * FROM users WHERE username = '{username}'"
    conn = sqlite3.connect(':memory:')
    cur = conn.cursor()
    cur.execute(query)
    return "Done"
