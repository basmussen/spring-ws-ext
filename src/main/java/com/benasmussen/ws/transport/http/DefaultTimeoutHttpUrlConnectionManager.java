package com.benasmussen.ws.transport.http;

import java.io.IOException;
import java.net.HttpURLConnection;

import org.springframework.ws.transport.http.HttpUrlConnectionMessageSender;

public class DefaultTimeoutHttpUrlConnectionManager extends HttpUrlConnectionMessageSender
{

    protected int readTimeout = 60 * 1000;

    protected int connectionTimeout = 60 * 1000;

    @Override
    protected void prepareConnection(HttpURLConnection connection) throws IOException
    {
        super.prepareConnection(connection);
        connection.setReadTimeout(getReadTimeout());
        connection.setConnectTimeout(getConnectionTimeout());
    }

    public int getReadTimeout()
    {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout)
    {
        if (readTimeout < 0)
        {
            throw new IllegalArgumentException("Timeout must be non-negativ value");
        }
        this.readTimeout = readTimeout;
    }

    public int getConnectionTimeout()
    {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout)
    {
        if (connectionTimeout < 0)
        {
            throw new IllegalArgumentException("Timeout must be non-negativ value");
        }

        this.connectionTimeout = connectionTimeout;
    }

}
