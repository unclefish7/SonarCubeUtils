import sqlite3
conn = sqlite3.connect(':memory:')
cur = conn.cursor()
user_input = "admin' --"
query = "SELECT * FROM users WHERE username = '%s'" % user_input
cur.execute(query)
