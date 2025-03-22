import sqlite3
conn = sqlite3.connect(':memory:')
cur = conn.cursor()
user_input = "admin"
cur.execute("SELECT * FROM users WHERE username = ?", (user_input,))
