package com.ddp.lrs.models

case class DailyQuoteResult(dataset: DatasetData)

case class DatasetData(data:List[(String,Double)])
