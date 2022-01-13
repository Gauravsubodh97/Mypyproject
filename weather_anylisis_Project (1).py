#!/usr/bin/env python
# coding: utf-8

# In[ ]:


#WORKING ON REAL PROJECT WITH PYTHON
#(A PART OF BIG DATA ANALYSIS)
#THE WEATHER DATASET 
#Here the weater dataset is a time-series dataset with per-hour information about the wearther conditions at particuar loactions
#it records Temerature .Dew point .Realative  Humidity .wind speed .visibility <pressure , and condition .
#this data is availble as CSV file .we are going to analyze this data set usisng Pands DataFrame.


# In[4]:


import pandas as pd
import seaborn as sns #Seaborn is used for visvilization of datak
sns.set(color_codes=True)


# In[5]:


data= pd.read_csv(r"C:\Users\grvsm\Desktop\Project\1. Weather Data.csv")


# In[6]:


data


# In[4]:


data.info()


# In[6]:


data.head() #it shows the first N row in the data(by default N=5)


# In[6]:


data.shape #it show the total no. of column of the dataframe


# In[9]:


data.index    #this attribute provides the index of the dataframe


# In[10]:


data.columns     # it shows the name of each column


# In[11]:


data.dtypes       #it show the data-type of each column


# In[14]:


data['Weather'].unique()  #it show unique values


# In[8]:


data.nunique()


# In[9]:


data.count()      #it show the total  no. of non - null values in each calumn .it can be applied on a single column as well as on whole data frame


# In[14]:


data['Weather'].value_counts()    #** in a column ,it show all the unique values with their count.it can be appied on singke column only.


# In[15]:


data.info()   #provides basic information about the datafram


# In[16]:


# Q) Find all the unique 'wind speed ' values in the data
data.head(2)


# In[17]:


data.nunique()


# In[18]:


data['Wind Speed_km/h'].nunique()


# In[19]:


data['Wind Speed_km/h'].unique()


# In[20]:


#Q) Find the number of times when the "weater is exactly Clear"
data.head(2)


# In[22]:


#Method Value count
data.Weather.value_counts()


# In[25]:


# method Filtering 
#data.head(2)
data[data.Weather=='Clear']


# In[27]:


# comand groupby
data.groupby('Weather').get_group('Clear')


# In[28]:


#Q)3. Find the numbere of times when the "wind Speed was exacly 4 km/h" 
data.head(2)


# In[31]:


#filtering method
data[data['Wind Speed_km/h']== 4]


# In[32]:


#Q) 4. Find out all the Null values in the data.
data.isnull().sum()


# In[33]:


data.notnull().sum()


# In[34]:


#Q)5. Rename the calumn name 'Weather' of tha dataframe to 'weather condition'
data.head(2)


# In[36]:


#temperary renaming
data.rename(columns = {'Weather' : 'Weather Condition'})


# In[37]:


data.head(2)


# In[38]:


#Permanent renaming 
data.rename(columns = {'Weather' : 'Weather Condition'},inplace =True)


# In[39]:


data.head(2)


# In[40]:


#Q.6) What is the mean 'visability'?
data.head(2)


# In[42]:


#mean value
data.Visibility_km.mean()


# In[43]:


#Q.7) What is the Standard deviation of"Pressure"in the data?
data.Press_kPa.std()


# In[45]:


#Q.8) whats is the variance of 'Realative Humidity'in this data?
data['Rel Hum_%'].var()


# In[51]:


#Q.8) Find all instance when 'Snow'was recorded
#value count
#data.head(2)
data['Weather Condition'].value_counts()


# In[53]:


# Filtering
data[data['Weather Condition']=='Snow']


# In[55]:


#str.contains
data[data['Weather Condition'].str.contains('Snow')].head(100)


# In[56]:


data[data['Weather Condition'].str.contains('Snow')].tail(100)


# In[57]:


data[data['Weather Condition'].str.contains('Snow')]


# In[58]:


#Q.10) Find all instance when 'wind Speed is Above 24'all visibiity is 25.
data.head(2)


# In[61]:


data[(data['Wind Speed_km/h']>24)& (data['Visibility_km']==25)]


# In[15]:


#Q.11)What is the mean value of each column against each 'Weather condition'?
#data.head(2)
data.groupby('Weather').mean()


# In[18]:


#Q.12) what is the mMinimum & maximum value of each column agaunst each 'weater condition'?
data.head(2)
data.groupby('Weather').min() #for min. value
data.groupby('Weather').max() #for max. value


# In[21]:


#Q.13)Show all the records where weather conditions is Fog?
data[data['Weather']=='Fog']


# In[27]:


#Q.14) Find all instances when 'weather is Clear 'or 'Visibility is above 40'.
data[(data['Weather'] ==  'Clear') |(data['Visibility_km'] >40)].tail(50)


# In[28]:


#Q.15) Find all the Instances when:
#A. 'Weather is clear' and 'Relative Humidity'is greater than 50.
#or
#B. 'visability is above 40'
data.head(2)


# In[31]:


data[(data['Weather']=='Clear')&(data['Rel Hum_%'] >50) |(data['Visibility_km'] > 40)]


# In[10]:


sns.displot(data['Temp_C'])


# In[19]:


sns.jointplot(data['Temp_C'],data['Visibility_km'].tail(20))


# In[21]:


sns.jointplot(data['Temp_C'],data['Visibility_km'],kind="hex")


# In[23]:


sns.jointplot(data['Temp_C'],data['Visibility_km'],kind="kde")


# In[13]:


sns.pairplot(data[['Temp_C','Visibility_km','Wind Speed_km/h']].tail(20))


# In[29]:


sns.stripplot(data['Weather'],data['Visibility_km'].tail(200))


# In[26]:





# In[ ]:




