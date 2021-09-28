import requests
from bs4 import BeautifulSoap
from send_email import sendMail
import time

headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.77 Safari/537.36"
}


def checkPrice(url):

    page = requests.get(url, headers=headers)

    htmlPage = BeautifulSoup(page.content, 'html.parser')

    productTitle = htmlPage.find("h1", class_="pr-new-br").getText()

    price = htmlPage.find("span", class_="prc-slg").getText()

    convertedPrice = float(price.replace(",", ".").replace(" TL", ""))

    image = htmlPage.find("img", class_="ph-gl-img")

    priceThreshold = convertedPrice

    if(convertedPrice < priceThreshold):
        print("Ürün Fiyatı Düştü")
        htmlEmailContent = """\
            <html>
            <head></head>
            <body>
            <h3>{0}</h3>
            <br/>
            {1}
            <br/>
            <a href={2}>Ürün Linki</a>
            </body>
            </html>
            """.format(productTitle, image, url)
        sendMail("ozmen.51@hotmail.com", "Ürün Fiyatı Düştü", htmlEmailContent)

    else:
        print("Ürün Fiyatı Sabit")
    print(productTitle)
    print("Ürün Fiyatı : {}".format(convertedPrice))


while(True):
    checkPrice(url)
    time.sleep(30)
