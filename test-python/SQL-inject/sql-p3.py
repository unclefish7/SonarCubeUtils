import sqlite3
conn = sqlite3.connect(':memory:')
cur = conn.cursor()
user_input = "admin"
query = f"SELECT * FROM users WHERE username = '{user_input}'"
cur.execute(query)
