
package com.gmail.judekwashie70.NewsApp;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class News$$Parcelable
    implements Parcelable, ParcelWrapper<com.gmail.judekwashie70.NewsApp.News>
{

    private com.gmail.judekwashie70.NewsApp.News news$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<News$$Parcelable>CREATOR = new Creator<News$$Parcelable>() {


        @Override
        public News$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new News$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public News$$Parcelable[] newArray(int size) {
            return new News$$Parcelable[size] ;
        }

    }
    ;

    public News$$Parcelable(com.gmail.judekwashie70.NewsApp.News news$$2) {
        news$$0 = news$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(news$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.gmail.judekwashie70.NewsApp.News news$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(news$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(news$$1));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.gmail.judekwashie70.NewsApp.News.class, news$$1, "mNesDescription"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.gmail.judekwashie70.NewsApp.News.class, news$$1, "mAuthor"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.gmail.judekwashie70.NewsApp.News.class, news$$1, "mImage"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.gmail.judekwashie70.NewsApp.News.class, news$$1, "mTitle"));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.gmail.judekwashie70.NewsApp.News getParcel() {
        return news$$0;
    }

    public static com.gmail.judekwashie70.NewsApp.News read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.gmail.judekwashie70.NewsApp.News news$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            news$$4 = new com.gmail.judekwashie70.NewsApp.News();
            identityMap$$1 .put(reservation$$0, news$$4);
            InjectionUtil.setField(com.gmail.judekwashie70.NewsApp.News.class, news$$4, "mNesDescription", parcel$$3 .readString());
            InjectionUtil.setField(com.gmail.judekwashie70.NewsApp.News.class, news$$4, "mAuthor", parcel$$3 .readString());
            InjectionUtil.setField(com.gmail.judekwashie70.NewsApp.News.class, news$$4, "mImage", parcel$$3 .readString());
            InjectionUtil.setField(com.gmail.judekwashie70.NewsApp.News.class, news$$4, "mTitle", parcel$$3 .readString());
            com.gmail.judekwashie70.NewsApp.News news$$3 = news$$4;
            identityMap$$1 .put(identity$$1, news$$3);
            return news$$3;
        }
    }

}
