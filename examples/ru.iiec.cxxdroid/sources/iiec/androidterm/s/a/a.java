package iiec.androidterm.s.a;

import android.content.IntentSender;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;

public interface a extends IInterface {

    /* renamed from: iiec.androidterm.s.a.a$a  reason: collision with other inner class name */
    public static abstract class AbstractBinderC0148a extends Binder implements a {
        public AbstractBinderC0148a() {
            attachInterface(this, "iiec.androidterm.libtermexec.v1.ITerminal");
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("iiec.androidterm.libtermexec.v1.ITerminal");
                ResultReceiver resultReceiver = null;
                ParcelFileDescriptor parcelFileDescriptor = parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null;
                if (parcel.readInt() != 0) {
                    resultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                }
                IntentSender a = a(parcelFileDescriptor, resultReceiver);
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("iiec.androidterm.libtermexec.v1.ITerminal");
                return true;
            }
        }
    }

    IntentSender a(ParcelFileDescriptor parcelFileDescriptor, ResultReceiver resultReceiver);
}
