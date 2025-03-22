from sqlalchemy.sql import text
from sqlalchemy import create_engine
engine = create_engine('sqlite:///:memory:')
with engine.connect() as conn:
    user_input = "admin"
    conn.execute(text("SELECT * FROM users WHERE username=:name"), {"name": user_input})
