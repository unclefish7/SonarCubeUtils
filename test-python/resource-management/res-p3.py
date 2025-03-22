import sqlite3
conn = sqlite3.connect(':memory:')
cur = conn.cursor()
cur.execute("SELECT 1")
