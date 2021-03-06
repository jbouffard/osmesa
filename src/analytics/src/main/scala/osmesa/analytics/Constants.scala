package osmesa.analytics

object Constants {
  val HASHTAG_SET = """#([^\u2000-\u206F\u2E00-\u2E7F\s\\'!"#$%()*,.\/:;<=>?@\[\]^{|}~]+)""".r

  val ROAD_VALUES =
    Set(
      "motorway", "trunk", "motorway_link", "trunk_link", "primary", "secondary", "tertiary",
      "primary_link", "secondary_link", "tertiary_link", "service", "residential", "unclassified",
      "living_street", "road", "path"
    )

  val WATERWAY_VALUES =
    Set(
      "river", "canal", "stream", "brook", "drain", "ditch"
    )
}
