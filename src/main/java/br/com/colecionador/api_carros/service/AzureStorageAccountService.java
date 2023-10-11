package br.com.colecionador.api_carros.service;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobContainerClientBuilder;

public class AzureStorageAccountService {

    public String uploadFileToAzure(MultipartFile file) throws IOException {
        String connectionString = "DefaultEndpointsProtocol=https;AccountName=storageapicarros;AccountKey=tRGdeh7llYq0/m5AX7AwcuqTKbw2WuXOB5lcSwdONvDjex3pPmuQvoiaVohgOmhPp1MK9yvaQvJm+ASt5/3/HA==;EndpointSuffix=core.windows.net";

        BlobContainerClient client = new BlobContainerClientBuilder()
                .connectionString(connectionString)
                .containerName("images")
                .buildClient();

        BlobClient blob = client.getBlobClient(file.getOriginalFilename());

        blob.upload(file.getInputStream(), file.getSize(), true);

        return "https://storageapicarros.blob.core.windows.net/images" + file.getOriginalFilename();
    }
}