CREATE TABLE itinerary (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(200) NOT NULL,
    type VARCHAR(50) NOT NULL
);
CREATE TABLE itinerary_item (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    itinerary_id BIGINT,
    place_name VARCHAR(200),
    CONSTRAINT fk_itinerary FOREIGN KEY (itinerary_id) REFERENCES itinerary(id)
);