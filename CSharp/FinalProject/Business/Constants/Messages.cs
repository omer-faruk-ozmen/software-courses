using System;
using System.Collections.Generic;
using System.Linq;
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
        public static string ProductDeleted;
        public static string ProductCountOfCategoryError ="Bir kategoride en fazla 10 adet ürün olabilir.";
        public static string ProductNameAlreadyExists="Bu isimde zaten başka bir ürün var";
        public static string CategoryLimitExceded="Kategori limiti aşıldı.";
    }
}
