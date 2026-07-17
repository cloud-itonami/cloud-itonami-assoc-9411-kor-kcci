(ns association.facts
  "Industry rule/history catalog for the Korea Chamber of Commerce
  and Industry (KCCI, 대한상공회의소) -- a 56th industry-association-
  level source (see cloud-itonami-assoc-9411-sau-fsc, -9411-aut-wko,
  -9411-irl-ibec, -9411-nzl-businessnz, -9411-cze-spcr, -9411-ind-cii,
  -9411-zaf-busa, -9411-bra-cni, -9411-ken-kam, -9411-can-chamber,
  -9411-mex-coparmex, -9411-ita-confindustria, -9411-nld-vnoncw for
  the first thirteen) per ADR-2607141700
  (cloud-itonami-compliance-fact-federation). The FOURTEENTH entry
  aligned to ISIC 9411 (activities of business, employers, and
  professional membership organizations). Fills South Korea's
  previously-open association-axis gap (one of the 14-country gap
  list recorded at tick 148) -- South Korea now has real,
  individually verified facts across ALL THREE axes (country:
  cloud-itonami-iso3166-kor statute.facts; municipality:
  cloud-itonami-municipality-kor-seoul; association: this entry).

  korcham.net's own domain uses an old-style ASP site structure that
  could not be navigated to a specific founding-history page this
  tick (the main page rendered but contained no historical content;
  a guessed history-page URL 404'd). Both entries here were instead
  directly WebFetch-verified against en.wikipedia.org's own article,
  which quotes verbatim: 'The Korea Chamber of Commerce and Industry
  traces its origins to the Seoul (Hanseong) Chamber of Commerce,
  which was founded in 1884' and 'With the passage of the Chamber of
  Commerce Act in 1952, it became an official statutory body'. The
  1884 date is independently corroborated by Wikidata Q12592604's own
  'inception' statement, which itself cites the Encyclopedia of
  Korean Culture (한국민족문화대백과사전, a national reference work)
  as its source. No personal names of office-holders are persisted
  here.

  An association not in `catalog` has NO spec-basis, full stop; never
  fabricate one.")

(def catalog
  "association-slug -> vector of association-rule entries."
  {"kcci"
   [{:association-rule/id "kcci.predecessor-seoul-chamber-1884"
     :association-rule/title "Korea Chamber of Commerce and Industry (KCCI) traces its origins to the Seoul (Hanseong) Chamber of Commerce, founded in 1884 (Wikipedia, corroborated by Wikidata Q12592604 inception statement citing the Encyclopedia of Korean Culture)"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :governance-program
     :association-rule/url "https://en.wikipedia.org/wiki/Korea_Chamber_of_Commerce_and_Industry"
     :association-rule/url-provenance :wikipedia-corroborated
     :association-rule/established-date "1884"
     :association-rule/retrieved-at "2026-07-17"
     :association-rule/topic #{:governance}}
    {:association-rule/id "kcci.statutory-body-1952"
     :association-rule/title "With the passage of the Chamber of Commerce Act in 1952, KCCI became an official statutory body (Wikipedia)"
     :association-rule/association "kcci"
     :association-rule/isic "9411"
     :association-rule/country "KOR"
     :association-rule/kind :governance-program
     :association-rule/url "https://en.wikipedia.org/wiki/Korea_Chamber_of_Commerce_and_Industry"
     :association-rule/url-provenance :wikipedia-corroborated
     :association-rule/established-date "1952"
     :association-rule/retrieved-at "2026-07-17"
     :association-rule/topic #{:governance}}]})

(defn spec-basis [association] (get catalog association))

(defn coverage
  ([] (coverage (keys catalog)))
  ([associations]
   (let [have (filter catalog associations)
         missing (remove catalog associations)]
     {:requested (count associations)
      :covered (count have)
      :covered-associations (vec (sort have))
      :missing-associations (vec (sort missing))
      :note (str "cloud-itonami-assoc-9411-kor-kcci Wave 0 (ADR-2607141700): "
                 (count (get catalog "kcci")) " KCCI entries seeded "
                 "with Wikipedia + Wikidata Q12592604 corroboration "
                 "(korcham.net's old-style ASP site had no navigable history page this tick). "
                 "Extend `association.facts/catalog`, never fabricate an id/url.")})))

(defn by-topic [association topic]
  (filterv #(contains? (:association-rule/topic %) topic) (spec-basis association)))
