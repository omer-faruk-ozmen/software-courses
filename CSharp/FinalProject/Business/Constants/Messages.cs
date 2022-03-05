using Core.Entities.Concrete;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Business.Constants
{
    public static class Messages
    {
        public static string ProductAdded = "Ürün eklendi";
        public static string ProductNameInvalid = "Ürün ismi geçersiz";
        public static string MaintenanceTime = "Veri erişimi kısıtlı saat";
        public static string ProductsListed = "Ürünler listelendi";
        public static string CategoriesListed = "Kategoriler listelendi";
        public static string ProductDeleted = "Ürün silindi.";
        public static string ProductCountOfCategoryError = "Bir kategoride en fazla 10 adet ürün olabilir.";
        public static string ProductNameAlreadyExists = "Bu isimde zaten başka bir ürün var";
        public static string CategoryLimitExceded = "Kategori limiti aşıldı.";
        public static string AuthorizationDenied = "Yetkiniz yok.";
        public static string UserRegistered = "Kullanıcı kayıt edildi";
        public static string UserNotFound = "Kullanıcı bulunamadı.";
        public static string PasswordError = "Parola hatalı";
        public static string UserAlreadyExists = "Kullanıcı kaydı var.";
        public static string AccessTokenCreated = "Token oluşturuldu";
        public static string SuccessfulLogin = "Giriş başarılı";
    }
}
