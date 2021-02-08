# coding: utf-8
from ..message.api import MessageService
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol
from thrift.server import TServer

import smtplib
from email.mime.text import MIMEText
from email.header import Header

sender = 'imoocd@163.com' # the email you send
authCode = 'aA111111'

class MessageServiceHandler:

    def sendMobileMessage(self, mobile, message):
        print("sendMobileMessage, mobile :" + mobile + ", message : " + message)
        return True

    def sendEmailMessage(self, email, message):
        print("sending the Email, email : " + email + ", message : " + message)
        messageObj = MIMEText(message, "plain", "utf-8")
        messageObj['From'] = sender
        messageObj['To'] = email
        messageObj['Subject'] = Header("Dev Ops Test Email", "utf-8")
        try :
            smtpObj = smtplib.SMTP('smtp.163.com')
            smtpObj.login(sender, authCode)
            smtpObj.sendmail(sender, [email], messageObj.as_string())
            print("send the email successfully")
            return True
        except:
            print("send the email failed")
            return False

if __name__ == '__main__':

    # init the thrift service
    handler = MessageServiceHandler()
    processor = MessageService.Processor(handler)
    transport = TSocket.TServerSocket(None, "9090")
    tfactory = TTransport.TFramedTransportFactory()
    pfactory = TBinaryProtocol.TBinaryProtocolFactory()

    server = TServer.TSimpleServer(processor, transport, tfactory, pfactory)
    print ("python thrift server start")
    server.serve()
    print ("python thrift server exit")