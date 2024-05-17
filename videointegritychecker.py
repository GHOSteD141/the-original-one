import cv2

# Open the video file
cap = cv2.VideoCapture(r"C:\Downloads\1062830806-preview.mp4")

# Check if the video file was opened successfully
if not cap.isOpened():
    print("Error: Unable to open video file")
    exit(1)

# Read frames from the video file
while True:
    # Capture frame-by-frame
    ret, frame = cap.read()

    # Check if a frame was captured successfully
    if not ret:
        print("Error: Unable to capture frame")
        break

    # Display the frame on the screen
    cv2.imshow("Frame", frame)

    # Check if the user pressed the 'Esc' key to quit
    if cv2.waitKey(30) & 0xFF == 27:
        break

# Release the video capture object
cap.release()

# Close all open windows
cv2.destroyAllWindows()