from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker
from models import User

engine = create_engine('sqlite:///:memory:')
Session = sessionmaker(bind=engine)
session = Session()
user = session.query(User).filter_by(username='admin').first()
