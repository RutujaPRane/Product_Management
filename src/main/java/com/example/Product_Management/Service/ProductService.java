package com.example.Product_Management.Service;

import com.example.Product_Management.Entity.Product;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class ProductService {
    public static final String COL_NAME="Bazar";

    public String saveProduct(Product product) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_NAME).document(product.getBarcode()).set(product);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public Product fetchProduct(String barcode) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection(COL_NAME).document(barcode);
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();
        Product product;
        if (document.exists()){
            return document.toObject(Product.class);
        }
        return null;
    }
    public String updateProduct(Product product) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_NAME).document(product.getBarcode()).set(product);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public String deleteProduct(String barcode) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> writeResult = dbFirestore.collection(COL_NAME).document(barcode).delete();
        return "Successfully deleted";
    }

    public List<Product> fetchProductList() throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<QuerySnapshot> future = dbFirestore.collection(COL_NAME).get();
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();
        List<Product> products = new ArrayList<>();
        for (QueryDocumentSnapshot document : documents){
            products.add(document.toObject(Product.class));
        }
        return products;

    }

    public List<Product> getAllProductByValue(Long greaterThan, Long lessThan) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        Query future = dbFirestore.collection(COL_NAME).whereGreaterThan("price1",greaterThan).whereLessThan("price1",lessThan);
        ApiFuture<QuerySnapshot> querySnapshotApiFuture = future.get();
        List<QueryDocumentSnapshot> documents = querySnapshotApiFuture.get().getDocuments();

        List<Product> products = new ArrayList<>();
        for (QueryDocumentSnapshot document : documents){
            products.add(document.toObject(Product.class));
        }
        return products;


    }
}
